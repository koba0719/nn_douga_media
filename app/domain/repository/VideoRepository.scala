package domain.repository

import domain.entity.Video

import scala.concurrent.Future

trait VideoRepository {
  /**
    * 動画のプロパティを保存する
    */
  def create(video: Video): Future[Unit]
}
