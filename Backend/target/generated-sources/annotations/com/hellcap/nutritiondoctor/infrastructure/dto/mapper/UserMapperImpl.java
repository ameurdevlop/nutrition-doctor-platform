package com.hellcap.nutritiondoctor.infrastructure.dto.mapper;

import com.hellcap.nutritiondoctor.domain.models.Role;
import com.hellcap.nutritiondoctor.domain.models.User;
import com.hellcap.nutritiondoctor.infrastructure.dto.request.LoginUserDto;
import com.hellcap.nutritiondoctor.infrastructure.dto.request.RegisterUserDto;
import com.hellcap.nutritiondoctor.infrastructure.dto.response.UserResponse;
import com.hellcap.nutritiondoctor.infrastructure.entity.UserEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-10-06T18:30:16+0100",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.46.100.v20260826-1225, environment: Java 21.0.12.1 (Eclipse Adoptium)"
)
@Component
public class UserMapperImpl extends UserMapper {

    @Override
    public UserEntity toEntity(User user) {
        if ( user == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setId( user.getId() );
        userEntity.setOrigin( user.getOrigin() );
        userEntity.setRole( user.getRole() );
        userEntity.setName( user.getName() );
        userEntity.setLastname( user.getLastname() );
        userEntity.setEmail( user.getEmail() );
        userEntity.setPassword( user.getPassword() );
        userEntity.setGender( user.getGender() );
        userEntity.setAge( user.getAge() );
        userEntity.setAddress( user.getAddress() );
        userEntity.setBirthday( user.getBirthday() );
        userEntity.setPhone( user.getPhone() );
        userEntity.setVerifiedEmail( user.isVerifiedEmail() );
        userEntity.setVerifiedPhone( user.isVerifiedPhone() );
        userEntity.setSessionActive( user.isSessionActive() );
        userEntity.setAvatar( user.getAvatar() );

        return userEntity;
    }

    @Override
    public User toModel(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        User user = new User();

        user.setName( userEntity.getName() );
        user.setLastname( userEntity.getLastname() );
        user.setEmail( userEntity.getEmail() );
        user.setPassword( userEntity.getPassword() );
        user.setGender( userEntity.getGender() );
        if ( userEntity.getAge() != null ) {
            user.setAge( userEntity.getAge() );
        }
        user.setAddress( userEntity.getAddress() );
        user.setBirthday( userEntity.getBirthday() );
        user.setRole( userEntity.getRole() );
        user.setId( userEntity.getId() );
        user.setPhone( userEntity.getPhone() );
        user.setVerifiedEmail( userEntity.isVerifiedEmail() );
        user.setVerifiedPhone( userEntity.isVerifiedPhone() );
        user.setSessionActive( userEntity.isSessionActive() );
        user.setOrigin( userEntity.getOrigin() );
        user.setAvatar( userEntity.getAvatar() );

        return user;
    }

    @Override
    public User fromRegisterDto(RegisterUserDto registerUserDto) {
        if ( registerUserDto == null ) {
            return null;
        }

        User user = new User();

        user.setName( registerUserDto.name() );
        user.setLastname( registerUserDto.lastname() );
        user.setEmail( registerUserDto.email() );
        user.setPassword( registerUserDto.password() );
        user.setRole( registerUserDto.role() );
        user.setPhone( registerUserDto.phone() );

        return user;
    }

    @Override
    public User loginUserDto(LoginUserDto loginUserDto) {
        if ( loginUserDto == null ) {
            return null;
        }

        User user = new User();

        user.setEmail( loginUserDto.email() );
        user.setPassword( loginUserDto.password() );
        user.setPhone( loginUserDto.phone() );

        return user;
    }

    @Override
    public List<User> toModels(List<UserEntity> all) {
        if ( all == null ) {
            return null;
        }

        List<User> list = new ArrayList<User>( all.size() );
        for ( UserEntity userEntity : all ) {
            list.add( toModel( userEntity ) );
        }

        return list;
    }

    @Override
    public UserResponse toResponseDto(User user) {
        if ( user == null ) {
            return null;
        }

        int id = 0;
        String name = null;
        String lastname = null;
        String email = null;
        String gender = null;
        int age = 0;
        String phone = null;
        String address = null;
        String birthday = null;
        Role role = null;
        String avatar = null;

        id = user.getId();
        name = user.getName();
        lastname = user.getLastname();
        email = user.getEmail();
        gender = user.getGender();
        age = user.getAge();
        phone = user.getPhone();
        address = user.getAddress();
        birthday = user.getBirthday();
        role = user.getRole();
        avatar = user.getAvatar();

        UserResponse userResponse = new UserResponse( id, name, lastname, email, gender, age, phone, address, birthday, role, avatar );

        return userResponse;
    }

    @Override
    public UserResponse toResponseDto(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        int id = 0;
        String name = null;
        String lastname = null;
        String email = null;
        String gender = null;
        int age = 0;
        String phone = null;
        String address = null;
        String birthday = null;
        Role role = null;
        String avatar = null;

        id = userEntity.getId();
        name = userEntity.getName();
        lastname = userEntity.getLastname();
        email = userEntity.getEmail();
        gender = userEntity.getGender();
        if ( userEntity.getAge() != null ) {
            age = userEntity.getAge();
        }
        phone = userEntity.getPhone();
        address = userEntity.getAddress();
        birthday = userEntity.getBirthday();
        role = userEntity.getRole();
        avatar = userEntity.getAvatar();

        UserResponse userResponse = new UserResponse( id, name, lastname, email, gender, age, phone, address, birthday, role, avatar );

        return userResponse;
    }
}
