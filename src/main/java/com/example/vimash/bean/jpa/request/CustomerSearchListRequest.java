package com.example.vimash.bean.jpa.request;

import org.apache.commons.collections4.MapUtils;

import com.example.vimash.bean.jpa.jpa.CustomerEntity;
import com.example.vimash.bean.jpa.jpa.response.PageResponse;

public class CustomerSearchListRequest extends PageRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void appendCondition(StringBuilder sql) {
		if (!MapUtils.isEmpty(this.searchFields)) {
			StringBuilder sqlWhere = new StringBuilder();
			this.searchFields.forEach((k, v) -> {
				switch (k) {
				case "name":
					System.out.println("case name");
					sqlWhere.append(String.format(" AND c.customerName LIKE %s", v));
					break;
				default:
//                        if (v instanceof String) {
//                            String value = (String) v;
//                            if (value.startsWith("%") || value.endsWith("%")) {
//                                sqlWhere.append(String.format(" AND c.customerName.%s LIKE :%s ", k, v));
//                            } else {
//                                sqlWhere.append(String.format(" AND c.customerName.%s = :%s ", k, v));
//                            }
//                        }
					return;
				}
			});
			if (sqlWhere.length() > 0) {
				sql.append(" where 1=1 ").append(sqlWhere);
				appendBetween(sql);
			}
		} else {

			sql.append(" where 1=1 ");
			appendBetween(sql);
		}
	}

	protected void appendBetween(StringBuilder sql) {
		StringBuilder sqlBetween = new StringBuilder();
		System.out.println(code2);
		System.out.println(code1);
		if (this.code1 != null && this.code2 != null) {
			sqlBetween.append(String.format(" AND ( c.customerCode BETWEEN '%s' AND '%s' ) ", code1, code2));
		}
		if (sqlBetween.length() > 0) {
			sql.append(sqlBetween);
		}
	}

	@Override
	public StringBuilder getQuery() {
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT c");
		sql.append(" FROM ");
		sql.append(" CustomerEntity c ");
		appendCondition(sql);
		return sql;
	}

	@Override
	public StringBuilder getCount() {
		StringBuilder sql = new StringBuilder();
		sql.append(" SELECT COUNT(c)");
		sql.append(" FROM ");
		sql.append("    CustomerEntity c ");
		appendCondition(sql);
		return sql;
	}

	@Override
	public Class<CustomerEntity> getEntityClass() {
		return CustomerEntity.class;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public <T extends PageResponse> Class<T> getResponseClass() {
		return null;
	}
}
