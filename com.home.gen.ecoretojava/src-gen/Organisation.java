public class Organisation {

    java.lang.String name;

    Experience experiences;
    Problem currentProblem;

    public java.lang.String getName () {
        return this.name;
    }

    public void setName (java.lang.String name) {
        this.name = name;
    }

    public Experience getExperiences () {
        return this.experiences;
    }
    public Problem getCurrentProblem () {
        return this.currentProblem;
    }

    public void setExperiences (Experience experiences) {
        this.experiences = experiences;
    }
    public void setCurrentProblem (Problem currentProblem) {
        this.currentProblem = currentProblem;
    }

    public  findSolution () {
    //TODO
    }

}
