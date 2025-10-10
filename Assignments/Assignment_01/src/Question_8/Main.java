package Question_8;

/*
8. What is wrong in the following code?

    public class Test
    {
        private int id;

        public void m1() { this.id = 45; }
        public void m2() { Test.id = 45; }
    }
*/

// ANSWER:
// in line 11: **"Test.id = 45"** is wrong
// Reason:
// because id is not a static variable if and only if id was a static variable this code would be
// viable (even though that would make line 10 not completely valid because we are trying to reference a
// static variable through an instance of this class which is not the best practice