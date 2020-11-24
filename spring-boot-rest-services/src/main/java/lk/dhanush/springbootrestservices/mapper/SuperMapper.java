package lk.dhanush.springbootrestservices.mapper;


public interface SuperMapper<Entity, Dto> {

    Entity toEntity(Dto dto);

    Dto toDto(Entity entity);

}
