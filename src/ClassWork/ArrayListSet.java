package ClassWork;

public class ArrayListSet {
 Object[] FirstSet = {null,null,null,null,null};
 Object[] SecondSet = {null,null,null,null,null};
 Object[] set = {null,null,null};
 public int SetDifferent;
    public int FirstSet0;
    public int FirstSet1;
    public int FirstSet2;
    public int FirstSet3;
    public int FirstSet4;

    public int SecondSet0;
    public int SecondSet1;
    public int SecondSet2;
    public int SecondSet3;
    public int SecondSet4;

    public int Diff0;
    public int Diff1;
    public int Diff2;
    public int Diff3;
    public int Diff4;

    public void SetFirstSet(int FirstSet0, int FirstSet1, int FirstSet2, int FirstSet3, int FirstSet4) {
        this.FirstSet0 = FirstSet0;
        this.FirstSet1 = FirstSet1;
        this.FirstSet2 = FirstSet2;
        this.FirstSet3 = FirstSet3;
        this.FirstSet4 = FirstSet4;

    }
    public void SetSecondSet(int SecondSet0, int SecondSet1, int SecondSet2, int SecondSet3, int SecondSet4) {
        this.SecondSet0 = SecondSet0;
        this.SecondSet1 = SecondSet1;
        this.SecondSet2 = SecondSet2;
        this.SecondSet3 = SecondSet3;
        this.SecondSet4 = SecondSet4;

    }
    public Object[] getFirstSet() {
        for (int i = 0; i < FirstSet.length; i++) {
                if (FirstSet[i] == FirstSet[0]) FirstSet[0] = FirstSet0;
                if (FirstSet[i] == FirstSet[1]) FirstSet[1] = FirstSet1;
                if (FirstSet[i] == FirstSet[2]) FirstSet[2] = FirstSet2;
                if (FirstSet[i] == FirstSet[3]) FirstSet[3] = FirstSet3;
                if (FirstSet[i] == FirstSet[4]) FirstSet[4] = FirstSet4;

            }

        return FirstSet;

    }

    public Object[] getSecondSet() {
        for (int i = 0; i < SecondSet.length; i++) {
            if (SecondSet[i] == SecondSet[0]) SecondSet[0] = SecondSet0;
            if (SecondSet[i] == SecondSet[1]) SecondSet[1] = SecondSet1;
            if (SecondSet[i] == SecondSet[2]) SecondSet[2] = SecondSet2;
            if (SecondSet[i] == SecondSet[3]) SecondSet[3] = SecondSet3;
            if (SecondSet[i] == SecondSet[4]) SecondSet[4] = SecondSet4;

        }

        return SecondSet;
    }


    public void SetDifferent(int Diff0, int Diff1, int Diff2) {
        this.Diff0 = Diff0;
        this.Diff1 = Diff1;
        this.Diff2 = Diff2;


    }

    public Object[] getDifferent() {
        for (int i = 0; i < set.length ; i++) {
            if (set[i] == set[0]) set[0] = Diff0;
            if (set[i] == set[1]) set[1] = Diff1;
            if (set[i] == set[2]) set[2] = Diff2;

        }
        return set;
    }

    public void SetDifferentAddition(int SetAddition) {
        this.SetDifferent = SetAddition;


    }

    public Object getDifferentAddition() {
        return Diff0 + Diff1 + Diff2;
    }
}
