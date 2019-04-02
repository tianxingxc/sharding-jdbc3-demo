package com.tx.algorithm;

import io.shardingsphere.api.algorithm.sharding.PreciseShardingValue;
import io.shardingsphere.api.algorithm.sharding.standard.PreciseShardingAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service("studentShardingStrategyAlgorithm")
public class StudentShardingStrategy implements PreciseShardingAlgorithm<Integer> {

    @Override
    public String doSharding(Collection<String> availableTargetNames, PreciseShardingValue<Integer> shardingValue) {
        System.out.println(availableTargetNames);
        Integer shardingKeyValue = shardingValue.getValue();
        System.out.println(shardingKeyValue);

        for(String tableName : availableTargetNames) {
            if(tableName.endsWith(String.valueOf(shardingKeyValue % 3))) {
                System.out.println(tableName);
                return tableName;
            }
        }
        return null;
    }
}
