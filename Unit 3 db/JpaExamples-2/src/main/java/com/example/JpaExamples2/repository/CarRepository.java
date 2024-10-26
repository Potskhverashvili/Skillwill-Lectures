package com.example.JpaExamples2.repository;

import com.example.JpaExamples2.model.Car;
import com.example.JpaExamples2.model.CarShortModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    @Query("""
            select new com.example.JpaExamples2.model.CarShortModel(c.brandName, c.modelName) from Car c
            where c.brandName = :brandName
            and c.releaseYear > :releaseYear
            """)
    List<CarShortModel> findCarShortModel(String brandName, Integer releaseYear);

    @Query("""
            select c from Car c
            where c.brandName = :brandName
            and c.releaseYear > :releaseYear
            """)
    Page<Car> findCarByBrandNameAndReleaseYearPage(String brandName,
                                                   Integer releaseYear,
                                                   Pageable pageable
                                                   );


    @Query("""
            select c from Car c
            where c.brandName = :brandName
            and c.releaseYear > :releaseYear
            order by c.id
            """)
    List<Car> findCarByBrandNameAndReleaseYear(String brandName, Integer releaseYear);

    @Query(value = """
            select * from car
            where car.brand_name = :brandName
            and car.release_year > :releaseYear
            order by car.car_id
            """, nativeQuery = true
    )
    List<Car> findCarByBrandNameAndReleaseYearNative(String brandName, Integer releaseYear);
}
