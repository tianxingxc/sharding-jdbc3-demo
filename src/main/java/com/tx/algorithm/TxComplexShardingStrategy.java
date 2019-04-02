package com.tx.algorithm;

import io.shardingsphere.api.algorithm.sharding.ShardingValue;
import io.shardingsphere.api.algorithm.sharding.complex.ComplexKeysShardingAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service("txComplexShardingStrategyAlgorithm")
public class TxComplexShardingStrategy implements ComplexKeysShardingAlgorithm {
    @Override
    public Collection<String> doSharding(Collection<String> availableTargetNames, Collection<ShardingValue> shardingValues) {
        return null;
    }
}
