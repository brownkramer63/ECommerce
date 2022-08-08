package catagory;

import java.time.LocalDate;
import java.util.UUID;

public class Electronic extends Category {

    public Electronic(UUID id, String name) {
        super(id, name);
    }

    @Override
    public LocalDate findDeliveryDueDate() {
        return null;
    }


}
