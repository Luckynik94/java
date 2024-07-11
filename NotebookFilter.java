package notebooks;

import java.util.*;

public class NotebookFilter {
    public static void filterNotebooks(
            Set<Notebook> notebooks,
            List<Integer> selectedCriteria,
            List<String> criteriaValues,
            Map<Integer, String> criteriaMap) {

        Set<Notebook> filteredNotebooks = new HashSet<>(notebooks);

        for (int i = 0; i < selectedCriteria.size(); i++) {
            int criterion = selectedCriteria.get(i);
            String value = criteriaValues.get(i);
            filteredNotebooks.removeIf(notebook -> !matchesCriterion(notebook, criterion, value, criteriaMap));
        }

        System.out.println("Отфильтрованные ноутбуки:");
        filteredNotebooks.forEach(System.out::println);
    }

    private static boolean matchesCriterion(Notebook notebook, int criterion, String value, Map<Integer, String> criteriaMap) {
        switch (criteriaMap.get(criterion)) {
            case "ram":
                return notebook.getRam() >= Integer.parseInt(value);
            case "hdd":
                return notebook.getHdd() >= Integer.parseInt(value);
            case "os":
                return notebook.getOs().equalsIgnoreCase(value);
            case "color":
                return notebook.getColor().equalsIgnoreCase(value);
            default:
                return false;
        }
    }
}