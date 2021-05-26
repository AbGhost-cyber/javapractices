package dremo;

import java.util.Scanner;

public class MVP implements Contract.View {
    String next;
    Presenter presenter = new Presenter(this, new Model());

    MVP() {
        System.out.println("Show quotes");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        while (input.equals("next")) {
            presenter.onButtonClick();
            System.out.println(next);
            input = sc.next();
        }
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void setString(String string) {
        next = string;
    }

    public static void main(String[] args) {
        MVP mvp = new MVP();
    }
}

