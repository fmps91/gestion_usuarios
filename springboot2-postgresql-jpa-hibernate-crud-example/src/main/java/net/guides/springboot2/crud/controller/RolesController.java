/* package net.guides.springboot2.crud.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.guides.springboot2.crud.exception.ResourceNotFoundException;
import net.guides.springboot2.crud.model.Rol;
import net.guides.springboot2.crud.repository.RolRepository;

@RestController
@RequestMapping("/api/v1")
public class RolesController {
	@Autowired
	private RolRepository RolRepository;

	@GetMapping("/roles")
	public List<Rol> getAllRoles() {
		
		return RolRepository.findAll();
	}

	@GetMapping("/roles/{id}")
	public ResponseEntity<Rol> getRolById(@PathVariable(value = "id") Long RolId)
			throws ResourceNotFoundException {
		Rol Rol = RolRepository.findById(RolId)
				.orElseThrow(() -> new ResourceNotFoundException("Rol not found for this id :: " + RolId));
		return ResponseEntity.ok().body(Rol);
	}

	@PostMapping("/roles")
	public Rol createRol(@Valid @RequestBody Rol Rol) {
		return RolRepository.save(Rol);
	}

	@PutMapping("/roles/{id}")
	public ResponseEntity<Rol> updateRol(@PathVariable(value = "id") Long RolId,
			@Valid @RequestBody Rol RolDetails) throws ResourceNotFoundException {
		Rol Rol = RolRepository.findById(RolId)
				.orElseThrow(() -> new ResourceNotFoundException("Rol not found for this id :: " + RolId));

		Rol.setnombre(RolDetails.getnombre());
		//Rol.setId_Usuario(RolDetails.getId_Usuario());
		
		final Rol updatedRol = RolRepository.save(Rol);
		return ResponseEntity.ok(updatedRol);
	}

	@DeleteMapping("/roles/{id}")
	public Map<String, Boolean> deleteRol(@PathVariable(value = "id") Long RolId)
			throws ResourceNotFoundException {
		Rol Rol = RolRepository.findById(RolId)
				.orElseThrow(() -> new ResourceNotFoundException("Rol not found for this id :: " + RolId));

		RolRepository.delete(Rol);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}


 */