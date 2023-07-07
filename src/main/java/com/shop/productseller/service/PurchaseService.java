package com.shop.productseller.service;

import com.shop.productseller.model.Purchase;
import com.shop.productseller.repository.projection.PurchaseItem;

import java.util.List;

public interface PurchaseService {
    Purchase savePurchase(Purchase purchase);

    List<PurchaseItem> findPurchaseItemsOfUser(Long userId);
}
