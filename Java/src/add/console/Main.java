package add.console;

public class Main {

    public static void main(String[] args) {
        String[] participant = new String[] {"leo", "kiki", "eden"};
        String[] participant1 = new String[] {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] participant2 = new String[] {"mislav", "stanko", "mislav", "ana"};
        String[] completion = new String[] {"eden", "kiki"};
        String[] completion1 = new String[] {"josipa", "filipa", "marina", "nikola"};
        String[] completion2 = new String[] {"stanko", "ana", "mislav"};
        Maraton maraton = new Maraton();

        System.out.println(maraton.solution(participant, completion));
    }
}
