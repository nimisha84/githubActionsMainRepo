package com.learn;

public class PMDError {
    // Rule: UncommentedEmptyConstructor
    public PMDError() {} // Violation: Empty constructor without comments

    // Rule: ShortMethodName
    public void a() {} // Violation: Method name is too short

    // Rule: AvoidFieldNameMatchingMethodName
    private int id;

    // Rule: ShortVariable
    private String x; // Violation: Variable name is too short

    // Rule: UselessParentheses
    public boolean isValid() {
        return (id > 0); // Violation: Useless parentheses
    }

//    // Rule: DataflowAnomalyAnalysis
//    public int divide(int a, int b) {
//        int result;
//        if (b != 0) {
//            result = a / b;
//        }
//        return result; // Violation: The variable 'result' might not have been initialized
//    }

    // Rule: EmptyCatchBlock
    public void doSomething() {
        try {
            // Code that might throw an exception
        } catch (Exception e) {
            // Empty catch block
        }
    }
}
