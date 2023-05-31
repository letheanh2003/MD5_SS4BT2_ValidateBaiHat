package rikkei.academy.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import rikkei.academy.model.Audio;

@Repository
public interface IAudioRepository extends PagingAndSortingRepository<Audio,Long> {

}
