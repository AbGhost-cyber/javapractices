package dremo;

import dremo.Contract;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Model implements Contract.Model {
    private final List<String> arrayList = Arrays.asList(
            "DSA Self Paced: Master the basics of Data Structures and Algorithms\n" +
                    " to solve complex problems efficiently. ",
            "Placement 100: This course will guide you for placement with theory,\n" +
                    "lecture videos, weekly assignments " +
                    "contests and doubt assistance.",
            "Amazon SDE Test Series: Test your skill & give the final touch to your \n" +
                    "preparation before applying for " +
                    "product based against like Amazon, Microsoft, etc.",
            "Complete Interview Preparation: Cover all the important concepts and\n" +
                    " topics required for the interviews. " +
                    "Get placement ready before the interviews begin",
            "Low Level Design for SDE 1 Interview: Learn Object-oriented Analysis and\n" +
                    " Design to prepare for " +
                    "SDE 1 Interviews in top companies"
    );

    @Override
    public void getNextCourse(OnFinishedListener onFinishedListener) {
        try {
            System.out.println("fetching please wait....");
            onFinishedListener.onFinished(getRandomString());
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private String getRandomString() {
        Random random = new Random();
        int index = random.nextInt(arrayList.size());
        return arrayList.get(index);
    }
}
