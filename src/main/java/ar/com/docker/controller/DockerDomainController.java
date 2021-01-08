package ar.com.docker.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public interface DockerDomainController {

	public String echoTest();
}
