/**
 * 自定义ORM框架，有以下特点
 * 1. 支持多数据源
 * 2. 支持全字段更新与增量字段更新（使用PreparedStatement防止sql注入）
 * 3. 支持ORM属性数据转换 {@link jforgame.orm.converter.Convert} {@link jforgame.orm.converter.AttributeConverter}
 * 4. 支持数据库schema自动建表，增加字段
 *
 */
package jforgame.orm;