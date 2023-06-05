DROP TABLE IF EXISTS `pms_product_category`;
CREATE TABLE `pms_product_category`
(
    `id`            bigint(20)                                                    NOT NULL AUTO_INCREMENT,
    `parent_id`     bigint(20)                                                    NULL DEFAULT NULL COMMENT 'The number of the upper level classification: 0 means the first level classification',
    `name`          varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci  NULL DEFAULT NULL,
    `level`         int(1)                                                        NULL DEFAULT NULL COMMENT 'Classification level: 0->1 level; 1->2 level',
    `product_count` int(11)                                                       NULL DEFAULT NULL,
    `product_unit`  varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci  NULL DEFAULT NULL,
    `nav_status`    int(1)                                                        NULL DEFAULT NULL COMMENT 'Display in the navigation bar: 0->do not display; 1->display',
    `show_status`   int(1)                                                        NULL DEFAULT NULL COMMENT 'Display status: 0->no display; 1->display',
    `sort`          int(11)                                                       NULL DEFAULT NULL,
    `icon`          varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT 'Icon',
    `keywords`      varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
    `description`   text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci         NULL COMMENT 'Description',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  AUTO_INCREMENT = 56
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_general_ci COMMENT = 'Product Category Table'
  ROW_FORMAT = DYNAMIC;

-- ----------------------------
INSERT INTO `pms_product_category` (`parent_id`, `name`, `level`, `product_count`, `product_unit`, `nav_status`, `show_status`, `sort`, `icon`, `keywords`, `description`)
VALUES (0, 'Electronics', 0, 100, 'pieces', 1, 1, 1, 'electronics_icon.png', 'electronics, gadgets, technology', 'Category for electronic products');
INSERT INTO `pms_product_category` (`parent_id`, `name`, `level`, `product_count`, `product_unit`, `nav_status`, `show_status`, `sort`, `icon`, `keywords`, `description`)
VALUES (0, 'Clothing', 0, 500, 'pieces', 1, 1, 2, 'clothing_icon.png', 'clothes, fashion, apparel', 'Category for clothing items');
INSERT INTO `pms_product_category` (`parent_id`, `name`, `level`, `product_count`, `product_unit`, `nav_status`, `show_status`, `sort`, `icon`, `keywords`, `description`)
VALUES (0, 'Home and Kitchen', 0, 200, 'pieces', 1, 1, 3, 'home_kitchen_icon.png', 'home, kitchenware, appliances', 'Category for home and kitchen products');
INSERT INTO `pms_product_category` (`parent_id`, `name`, `level`, `product_count`, `product_unit`, `nav_status`, `show_status`, `sort`, `icon`, `keywords`, `description`)
VALUES (0, 'Books', 0, 1000, 'pieces', 1, 1, 4, 'books_icon.png', 'books, literature, reading', 'Category for books and literary works');
INSERT INTO `pms_product_category` (`parent_id`, `name`, `level`, `product_count`, `product_unit`, `nav_status`, `show_status`, `sort`, `icon`, `keywords`, `description`)
VALUES (0, 'Sports and Fitness', 0, 300, 'pieces', 1, 1, 5, 'sports_fitness_icon.png', 'sports, fitness, exercise', 'Category for sports and fitness equipment');
INSERT INTO `pms_product_category` (`parent_id`, `name`, `level`, `product_count`, `product_unit`, `nav_status`, `show_status`, `sort`, `icon`, `keywords`, `description`)
VALUES (0, 'Beauty and Personal Care', 0, 400, 'pieces', 1, 1, 6, 'beauty_care_icon.png', 'beauty, personal care, cosmetics', 'Category for beauty and personal care products');
