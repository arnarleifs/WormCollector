/**
 * Created by Arnar on 14.3.2015.
 */
public class TrueFalse {
    // This variable will hold the value of the string ID
    // and therefor it's reference instead of the string itself
    // which will be stored in the res/values/strings.xml
    private int mQuestion;
    private boolean mTrueQuestion;

    public TrueFalse(int question, boolean trueQuestion)
    {
        mQuestion = question;
        mTrueQuestion = trueQuestion;
    }

    public int getQuestion()
    {
        return mQuestion;
    }

    public boolean isTrueQuestion()
    {
        return mTrueQuestion;
    }

    public void setQuestion(int question)
    {
        mQuestion = question;
    }

    public void setTrueQuestion(boolean trueQuestion)
    {
        mTrueQuestion = trueQuestion;
    }
}
