public class Problem {

    java.lang.String name;

    Solution solutions;
    Experience parentExp;

    public java.lang.String getName () {
        return this.name;
    }

    public void setName (java.lang.String name) {
        this.name = name;
    }

    public Solution getSolutions () {
        return this.solutions;
    }
    public Experience getParentExp () {
        return this.parentExp;
    }

    public void setSolutions (Solution solutions) {
        this.solutions = solutions;
    }
    public void setParentExp (Experience parentExp) {
        this.parentExp = parentExp;
    }


}
