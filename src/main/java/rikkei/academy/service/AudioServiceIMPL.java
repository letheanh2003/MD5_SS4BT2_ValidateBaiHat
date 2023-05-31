package rikkei.academy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rikkei.academy.model.Audio;
import rikkei.academy.repository.IAudioRepository;

@Service
public class AudioServiceIMPL implements IAudioService{
    @Autowired
    private IAudioRepository audioRepository;
    @Override
    public Iterable<Audio> findAll() {
        return audioRepository.findAll();
    }

    @Override
    public void save(Audio audio) {
        audioRepository.save(audio);
    }
}
