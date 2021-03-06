package co.melondev.cubedpay.data;

import java.util.Arrays;

public class ShopPackageRef {

    public enum Type {
        ID;

        public static Type findById(String id) {
            return Arrays.stream(values()).filter(status -> status.name().equalsIgnoreCase(id))
                    .findFirst().orElse(null);
        }
    }

    private String id;
    private Type type;
    private ShopPackage shopPackage;

    public String getId() {
        return id;
    }

    public Type getType() {
        return type;
    }

    public ShopPackage getShopPackage() {
        return shopPackage;
    }
}
