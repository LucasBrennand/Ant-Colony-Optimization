public class Main {
    public static void main(String[] args) {
        int numAnts = 20;
        int numDimensions = 10;
        int numIterations = 100;
        double evaporationRate = 0.1;

        double[] bestSolution = AntColonyOptimization.antColonyOptimization(numAnts, numDimensions, numIterations, evaporationRate);

        System.out.println("Melhor solução encontrada:");
        for (int i = 0; i < bestSolution.length; i++) {
            System.out.print(bestSolution[i] + " ");
        }
        System.out.println();
        System.out.println("Melhor valor de fitness: " + AntColonyOptimization.rosenbrock(bestSolution));
    }
}
