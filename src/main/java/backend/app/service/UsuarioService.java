package backend.app.service;

import backend.app.security.models.entity.Usuario;

public interface UsuarioService {

    public Usuario getUsuarioByUsername(String username);
    public Usuario getUsuarioByEmail(String email);
    public Usuario save(Usuario usuario);
}
