package tacos.data;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import tacos.Order;
import tacos.User;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {
//    List<Order> findByDeliveryZip(String deliveryZip);
//
//    List<Order> readOrdersByDeliveryZipAndPlacedAtBetween(String deliveryZip, Date startDate, Date endDate);
//
//    List<Order> findByDeliveryToAndDeliveryCityAllIgnoresCase(String deliveryTo, String deliveryCity);
//
//    @Query("Order o where o.deliveryCity = 'Seattle'")
//    List<Order> readOrdersDeliveredInSeattle();

    List<Order> findByUserOrderByPlacedAtDesc(User user, Pageable pageable);
}
