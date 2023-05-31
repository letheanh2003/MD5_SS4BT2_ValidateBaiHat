package rikkei.academy.service;

import rikkei.academy.model.Audio;

public interface IAudioService {
    Iterable<Audio> findAll();
    void save(Audio audio);
}
