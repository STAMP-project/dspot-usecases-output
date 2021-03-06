package org.sat4j;


import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.minisat.core.DataStructureFactory;
import org.sat4j.minisat.core.IOrder;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.orders.SubsetVarOrder;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.specs.TimeoutException;
import org.sat4j.tools.TextOutputTracing;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@Ignore
public class BugSAT79 {
    private ISolver solver;

    @Before
    public void setUp() throws Exception {
        solver = SolverFactory.newDefault();
        solver.addClause(new VecInt(new int[]{ 1, -2, 3 }));
    }

    @Test(timeout = 10000)
    public void test3_failAssert0() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            solver.setSearchListener(new TextOutputTracing<Object>(null));
            int[] backdoor = new int[]{ 1, 2, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(4).push(7);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(5).push(7);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-3)).push(6).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(1).push(2).push(3).push(7).push(8);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("test3 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }
}

