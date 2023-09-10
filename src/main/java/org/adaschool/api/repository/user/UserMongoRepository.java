package org.adaschool.api.repository.user;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

//conexion base de datos <tipo de dato maneja el doc, tipo de dato llave primaria>
@Repository
public interface UserMongoRepository extends MongoRepository<User, String> {
}
