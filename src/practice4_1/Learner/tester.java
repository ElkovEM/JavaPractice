package practice4_1.Learner;

import java.util.*;

public class tester {
    public static void main(String[] args) {
        Learner[] learners = new Learner[4];
        learners[0] = new SchoolStudent("Dima");
        learners[1] = new UniversityStudent("Egor");
        learners[2] = new UniversityStudent("Max");
        learners[3] = new SchoolStudent("Stas");
        System.out.println("School:");
        for (int i = 0; i < learners.length; i++)
        {
            if (learners[i] instanceof SchoolStudent)
            {
                System.out.println(learners[i].name);
            }
        }
        System.out.println("University:");
        for (int i = 0; i < learners.length; i++)
        {
            if (learners[i] instanceof UniversityStudent)
            {
                System.out.println(learners[i].name);
            }
        }
    }
}
