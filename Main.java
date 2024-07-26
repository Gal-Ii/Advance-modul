package f06_Defining_Classes.Pokemon_Trainer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Trainer> trainers = new ArrayList<>();

        while (!input.contains("Tournament")) {

            String[] inputArr = input.split("\\s+");
            String trainerName = inputArr[0];
            String pokemonName = inputArr[1];
            String pokemonElements = inputArr[2];
            int pokemonHealth = Integer.parseInt(inputArr[3]);

            Trainer trainer = getTrainersByName(trainers, trainerName);
            Pokemon pokemon = new Pokemon(pokemonName, pokemonElements, pokemonHealth);
            trainer.addPokemon(pokemon);

            input = scanner.nextLine();
        }

        String element = scanner.nextLine();

        while (!element.contains("End")) {

            for (Trainer trainer : trainers) {
                trainer.checkIfPokemonExistByElement(element);
            }
            element = scanner.nextLine();
        }

        Collections.sort(trainers, Comparator.comparing(Trainer::getBadges).reversed());
        for (Trainer trainer : trainers) {
            System.out.println(trainer);
        }
    }

    private static Trainer getTrainersByName(List<Trainer> trainers, String trainerName) {
        for (Trainer trainer : trainers) {
            if (trainer.getName().equals(trainerName)) {
                return trainer;
            }
        }

        Trainer trainer = new Trainer(trainerName);
        trainers.add(trainer);
        return trainer;
    }

}
