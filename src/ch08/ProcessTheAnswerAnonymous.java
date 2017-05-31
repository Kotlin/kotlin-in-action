package ch08;

import static ch08.ProcessTheAnswer.ProcessTheAnswer.*;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* Java */

public class ProcessTheAnswerAnonymous {
    public static void main(String[] args) {
        processTheAnswer(
            new Function1<Integer, Integer>() {
                @Override
                public Integer invoke(Integer number) {
                    System.out.println(number);
                    return number + 1;
                }
            });
    }
}
