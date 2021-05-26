package dremo;
//mvp example

public interface Contract {

interface  View{
    void showProgress();
    void hideProgress();
    void setString(String string);

}
  interface Model{
    interface OnFinishedListener{
        void onFinished(String string);
    }
    void getNextCourse(OnFinishedListener onFinishedListener);
  }

  interface Presenter{
    void onButtonClick();
    void onDestroy();
  }
}
