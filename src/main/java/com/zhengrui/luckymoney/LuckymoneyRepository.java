package com.zhengrui.luckymoney;

import org.springframework.data.jpa.repository.JpaRepository;


public interface LuckymoneyRepository extends JpaRepository<Luckymoney, Integer> {//<数据库实体类，id类型>
}
