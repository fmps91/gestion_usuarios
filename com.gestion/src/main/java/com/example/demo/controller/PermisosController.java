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
import net.guides.springboot2.crud.model.Permiso;
import net.guides.springboot2.crud.repository.PermisoRepository;

@RestController
@RequestMapping("/api/v1")
public class PermisosController {
	@Autowired
	private PermisoRepository permisoRepository;

	@GetMapping("/permisos")
	public List<Permiso> getAllRoles() {
		
		return permisoRepository.findAll();
	}

	@GetMapping("/permisos/{id}")
	public ResponseEntity<Permiso> getRolById(@PathVariable(value = "id") Long RolId)
			throws ResourceNotFoundException {
		Permiso Rol = permisoRepository.findById(RolId)
				.orElseThrow(() -> new ResourceNotFoundException("Permiso not found for this id :: " + RolId));
		return ResponseEntity.ok().body(Rol);
	}

	@PostMapping("/permisos")
	public Permiso createRol(@Valid @RequestBody Permiso Permiso) {
		return permisoRepository.save(Permiso);
	}

	@PutMapping("/permisos/{id}")
	public ResponseEntity<Permiso> updateRol(@PathVariable(value = "id") Long PermisoId,
			@Valid @RequestBody Permiso RolDetails) throws ResourceNotFoundException {
		Permiso permiso = permisoRepository.findById(PermisoId)
				.orElseThrow(() -> new ResourceNotFoundException("Permiso not found for this id :: " + PermisoId));

		permiso.setnombre(RolDetails.getnombre());
		//permiso.setId_Usuario(RolDetails.getId_Usuario());
		//Rol.set(RolDetails.getLastName());
		
		final Permiso updatedRol = permisoRepository.save(permiso);
		return ResponseEntity.ok(updatedRol);
	}

	@DeleteMapping("/permisos/{id}")
	public Map<String, Boolean> deleteRol(@PathVariable(value = "id") Long PermisoId)
			throws ResourceNotFoundException {
		Permiso permiso = permisoRepository.findById(PermisoId)
				.orElseThrow(() -> new ResourceNotFoundException("Permiso not found for this id :: " + PermisoId));

		permisoRepository.delete(permiso);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
 */