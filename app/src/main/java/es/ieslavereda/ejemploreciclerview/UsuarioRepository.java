package es.ieslavereda.ejemploreciclerview;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepository {

    private List<Usuario> usuarios;
    private static UsuarioRepository instance;

    private UsuarioRepository(){
        usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Manolo","Garcia Perez","Actor",R.mipmap.ic_actor_foreground));
        usuarios.add(new Usuario("Jose Luis"," El Delegado","Instagramer",R.mipmap.ic_instagramer_foreground));
        usuarios.add(new Usuario("Iván","Perez Salamero","Banquero",R.mipmap.ic_banquero_foreground));
        usuarios.add(new Usuario("David","Devis Tamarit","Policia",R.mipmap.ic_policia_round));
        usuarios.add(new Usuario("Gabriel","Eguidanos","Politico",R.mipmap.ic_politico_activo_foreground));
        usuarios.add(new Usuario("Lusi","Perez Garcia","Politico",R.mipmap.ic_politico_retirado_foreground));
        usuarios.add(new Usuario("Nelson","Baez Escudero","Estudiante",R.mipmap.ic_estudiante_foreground));
    }

    public static UsuarioRepository getInstance(){
        if (instance==null)
            instance = new UsuarioRepository();

        return instance;
    }


    public int getSize() {
        return usuarios.size();
    }

    public Usuario getUsuario(int position) {
        return usuarios.get(position);
    }
}
