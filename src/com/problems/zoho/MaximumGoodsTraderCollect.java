package com.problems.zoho;

/**
 * Day 10
 *
 * @author meganathan
 */
public class MaximumGoodsTraderCollect {

    public static int maximumGoodsTraderCanCollect(int initialEnergy, int[] goods, int[] travelEnergy, int[] tradeEnergy) {

        if (initialEnergy <= 0 || goods.length == 0 || tradeEnergy.length == 0 || travelEnergy.length == 0) {
            return 0;
        }

        int totalGoods = 0;
        int startingEnergy = initialEnergy;
        for (int i = 0; i < goods.length; i++) {
            if (startingEnergy >= travelEnergy[i]) {

                // minus the travel enegry
                startingEnergy -= travelEnergy[i];

                totalGoods += goods[i];

                // after trade plus the energy
                startingEnergy += tradeEnergy[i];
            } else {
                break; // we dont need to check next town
            }
        }
        return totalGoods;

    }

    public static void main(String[] args) {
        int initialEnegery = 20;
        int[] goods = {5, 10, 15};
        int[] travelEnergy = {5, 10, 8};
        int[] tradeEnergy = {5, 10, 15};

        System.out.println(maximumGoodsTraderCanCollect(initialEnegery, goods, travelEnergy, tradeEnergy));
    }
}
