public class StatusRule {
    public enum Status { PENDING, PROCESSING, COMPLETED }
 
    public static boolean canTransition(Status current, Status target) {
        if (current == null || target == null) {
            return false;
        }
        // Only two transitions are allowed:
        // PENDING -> PROCESSING (start repair), PROCESSING -> COMPLETED (finish repair)
        if (current == Status.PENDING && target == Status.PROCESSING) {
            return true;
        }
        if (current == Status.PROCESSING && target == Status.COMPLETED) {
            return true;
        }
        // Skip, rollback, same-state and any other pair are rejected.
        return false;
    }
}
