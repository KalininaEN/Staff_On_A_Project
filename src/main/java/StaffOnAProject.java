public class StaffOnAProject {

    public static void main(String[] args) {

        final int programmers = 5;
        System.out.println("programmers = " + programmers);

        final int qaTo1Programmer = 2;
        System.out.println("qaTo1Programmer = " + qaTo1Programmer);

        final int supportSpecTo1Prog = 3;
        System.out.println("supportSpecTo1Prog = " + supportSpecTo1Prog);

        final int countQa = programmers * qaTo1Programmer;
        System.out.println("countQa = " + countQa);

        final int countSupportSpec = programmers * supportSpecTo1Prog;
        System.out.println("countSupportSpec = " + countSupportSpec);

        final int allStuffOnProject = programmers + countQa + countSupportSpec;
        System.out.println("allStuffOnProject = " + allStuffOnProject);
    }
}
