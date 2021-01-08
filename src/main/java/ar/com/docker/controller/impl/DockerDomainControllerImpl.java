package ar.com.docker.controller.impl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.docker.controller.DockerDomainController;

@RestController
@RequestMapping("/docker")
public class DockerDomainControllerImpl implements DockerDomainController {

	@GetMapping("/echo-test")
	public String echoTest() {
		return "Tests is OK - Proyect a Dockerizar, deployado en AWS code ppipeline !!!!!!";
	}

}
