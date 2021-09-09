package one.digitalinnovation.experts.shoppingcart.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("item")
@Getter
@Setter
public class Item {
    private Integer productId;
    private Integer amount;
}
