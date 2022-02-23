package com.opensea_bot.server.utils;

import com.opensea_bot.server.models.*;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class JsonUtils {

    public OpenSeaCollection parseSingleCollection(String jsonString){
        try {
            JSONObject json = new JSONObject(jsonString);
            JSONObject collection = json.getJSONObject("collection");
            JSONArray editors = collection.getJSONArray("editors");
            JSONArray paymentTokens = collection.getJSONArray("payment_tokens");
            JSONArray primaryAssetContracts = collection.getJSONArray("primary_asset_contracts");
            //JSONArray traits = collection.getJSONArray("traits");
            JSONObject stats = collection.getJSONObject("stats");

            OpenSeaCollection openSeaCollection = new OpenSeaCollection();
            openSeaCollection.setName(collection.getString("name"));
            openSeaCollection.setExternalLink(collection.getString("external_url"));
            openSeaCollection.setDescription(collection.getString("description"));
            openSeaCollection.setSlug(collection.getString("slug"));
            openSeaCollection.setPayoutAddress(collection.getString("payout_address"));
            openSeaCollection.setImageUrl(collection.getString("image_url"));
            openSeaCollection.setBannerImageUrl(collection.getString("banner_image_url"));
            for (Object editor : editors){
                openSeaCollection.getEditors().add(editor.toString());
            }
            for (int i=0; i<paymentTokens.length(); i++) {
                OpenSeaCollectionPaymentToken paymentToken = new OpenSeaCollectionPaymentToken();
                JSONObject token = paymentTokens.getJSONObject(i);
                paymentToken.setId(String.valueOf(token.getInt("id")));
                paymentToken.setSymbol(token.getString("symbol"));
                paymentToken.setAddress(token.getString("address"));
                paymentToken.setImageUrl(token.getString("image_url"));
                paymentToken.setName(token.getString("name"));
                paymentToken.setDecimals(String.valueOf(token.getInt("decimals")));
                paymentToken.setEthPrice(String.valueOf(token.getFloat("eth_price")));
                paymentToken.setUsdPrice(String.valueOf(token.getFloat("usd_price")));
                openSeaCollection.getPaymentTokens().add(paymentToken);
            }
            for (int i=0; i<primaryAssetContracts.length(); i++) {
                OpenSeaCollectionPrimaryAssetContract contract = new OpenSeaCollectionPrimaryAssetContract();
                JSONObject primaryAssetContract = primaryAssetContracts.getJSONObject(i);
                contract.setAddress(primaryAssetContract.getString("address"));
                contract.setAssetContractType(primaryAssetContract.getString("asset_contract_type"));
                contract.setCreatedDate(LocalDateTime.parse(primaryAssetContract.getString("created_date")));
                contract.setName(primaryAssetContract.getString("name"));
                contract.setNftVersion(primaryAssetContract.getString("nft_version"));
                //contract.setOpenSeaVersion(primaryAssetContract.getString("opensea_version"));
                contract.setOwner(String.valueOf(primaryAssetContract.getInt("owner")));
                contract.setSchemaName(primaryAssetContract.getString("schema_name"));
                contract.setSymbol(primaryAssetContract.getString("symbol"));
                contract.setTotalSupply(primaryAssetContract.getString("total_supply"));
                contract.setDescription(primaryAssetContract.getString("description"));
                contract.setExternalLink(primaryAssetContract.getString("external_link"));
                contract.setImageUrl(primaryAssetContract.getString("image_url"));
                contract.setDefaultToFiat(primaryAssetContract.getBoolean("default_to_fiat"));
                contract.setDevBuyerFeeBasisPoints(primaryAssetContract.getInt("dev_buyer_fee_basis_points"));
                contract.setDevSellerFeeBasisPoints(primaryAssetContract.getInt("dev_seller_fee_basis_points"));
                contract.setOnlyProxiedTransfers(primaryAssetContract.getBoolean("only_proxied_transfers"));
                contract.setOpenSeaBuyerFeeBasisPoints(primaryAssetContract.getInt("opensea_buyer_fee_basis_points"));
                contract.setOpenSeaSellerFeeBasisPoints(primaryAssetContract.getInt("opensea_seller_fee_basis_points"));
                contract.setBuyerFeeBasisPoints(primaryAssetContract.getInt("buyer_fee_basis_points"));
                contract.setSellerFeeBasisPoints(primaryAssetContract.getInt("seller_fee_basis_points"));
                contract.setPayoutAddress(primaryAssetContract.getString("payout_address"));
                openSeaCollection.getPrimaryAssetContracts().add(contract);
            }


            OpenSeaCollectionStats openSeaCollectionStats = new OpenSeaCollectionStats();
            openSeaCollectionStats.setOneDayVolume(stats.getFloat("one_day_volume"));
            openSeaCollectionStats.setOneDayChange(stats.getFloat("one_day_change"));
            openSeaCollectionStats.setOneDaySales(stats.getFloat("one_day_sales"));
            openSeaCollectionStats.setOneDayAveragePrice(stats.getFloat("one_day_average_price"));
            openSeaCollectionStats.setSevenDayVolume(stats.getFloat("seven_day_volume"));
            openSeaCollectionStats.setSevenDayChange(stats.getFloat("seven_day_change"));
            openSeaCollectionStats.setSevenDaySales(stats.getFloat("seven_day_sales"));
            openSeaCollectionStats.setSevenDayAveragePrice(stats.getFloat("seven_day_average_price"));
            openSeaCollectionStats.setThirtyDayVolume(stats.getFloat("thirty_day_volume"));
            openSeaCollectionStats.setThirtyDayChange(stats.getFloat("thirty_day_change"));
            openSeaCollectionStats.setThirtyDaySales(stats.getFloat("thirty_day_sales"));
            openSeaCollectionStats.setThirtyDayAveragePrice(stats.getFloat("thirty_day_average_price"));
            openSeaCollectionStats.setTotalVolume(stats.getFloat("total_volume"));
            openSeaCollectionStats.setTotalSales(stats.getFloat("total_sales"));
            openSeaCollectionStats.setTotalSupply(stats.getFloat("total_supply"));
            openSeaCollectionStats.setCount(stats.getFloat("count"));
            openSeaCollectionStats.setNumberOfOwners(stats.getInt("num_owners"));
            openSeaCollectionStats.setAveragePrice(stats.getFloat("average_price"));
            openSeaCollectionStats.setNumberOfReports(stats.getInt("num_reports"));
            openSeaCollectionStats.setMarketCap(stats.getFloat("market_cap"));
            openSeaCollectionStats.setFloorPrice(stats.getFloat("floor_price"));
            openSeaCollection.setStats(openSeaCollectionStats);

            return openSeaCollection;
        }
        catch(Exception e){
            return null;
        }
    }
}

