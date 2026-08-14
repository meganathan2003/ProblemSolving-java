package Arrays;

public class DeliverySlotAllocator {

    private final int[] parent;

    DeliverySlotAllocator(int size) {
        parent = new int[size + 1];

        for (int i = 0; i <= size; i++) {
            parent[i] = i;
        }
    }

    private int find(int slot) {

        if (parent[slot] == slot) {
            return slot;
        }

        parent[slot] = find(parent[slot]);

        return parent[slot];
    }

    public int allocate(int requestedSlot) {

        int availableSlot = find(requestedSlot);

        if (availableSlot >= parent.length - 1) {
            return -1;
        }

        // Mark current slot as occupied.
        // Next search should start from the next slot.
        parent[availableSlot] = find(availableSlot + 1);

        return availableSlot;
    }

    static void main(String[] args) {

        DeliverySlotAllocator allocator =
                new DeliverySlotAllocator(4);

        int[] orders = {1, 2, 1, 3, 2, 4, 2, 1};

        for (int order : orders) {

            int assignedSlot = allocator.allocate(order);

            System.out.println(
                    "Requested: " + order + " → Assigned: " + assignedSlot
            );
        }

    }
}
