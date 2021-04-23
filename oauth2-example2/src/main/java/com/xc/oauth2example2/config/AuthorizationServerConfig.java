/*
 *
 *      Copyright (c) 2018-2025, dcms All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice,
 *  this list of conditions and the following disclaimer.
 *  Redistributions in binary form must reproduce the above copyright
 *  notice, this list of conditions and the following disclaimer in the
 *  documentation and/or other materials provided with the distribution.
 *  Neither the name of the pig4cloud.com developer nor the names of its
 *  contributors may be used to endorse or promote products derived from
 *  this software without specific prior written permission.
 *  Author: dcms
 *
 */

package com.xc.oauth2example2.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;

/**
 * @author dcms
 * @date 2018/6/22
 * 认证服务器配置
 */
@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
		security.allowFormAuthenticationForClients()
				.checkTokenAccess("permitAll()");
	}

	@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		clients.inMemory()
				.withClient("aaa")
				.secret(passwordEncoder.encode("111"))
				.authorizedGrantTypes("authorization_code")
				.scopes("all")
				.resourceIds("resource")
				.redirectUris("https://www.baidu.com/");
	}

}

