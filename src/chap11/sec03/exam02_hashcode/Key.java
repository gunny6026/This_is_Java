package chap11.sec03.exam02_hashcode;

import java.util.Objects;

public class Key {

    public int number;

    public Key(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Key){
            Key compareKey = (Key) obj;
            if (this.number == compareKey.number){
                return true;
            }
        }

        return false;
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(number);
//    }
}
