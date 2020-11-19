package io.serializble;

import java.io.Serializable;

/**
 * @description:
 * @author: l1usy
 * @time: 2020/11/19 22:45
 */
public class Goods implements Serializable {

    private static final long serialVersionUID = 5019876001014039966L;
    private String goodsId;
    private String goodsName;
    private double price;

    public Goods(String goodsId, String goodsName, double price) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.price = price;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsId='" + goodsId + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", price=" + price +
                '}';
    }
}
