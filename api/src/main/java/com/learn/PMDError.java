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

    
    // Rule: EmptyCatchBlock
    public void doSomething() {
        try {
            // Code that might throw an exception
        } catch (Exception e) {
            // Empty catch block
        }
    }
}
