package ua.lviv.iot.lessonwithzenyk.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.lessonwithzenyk.models.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
