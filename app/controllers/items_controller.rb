class ItemsController < ApplicationController
  def index
    render json: serializer.serialize_collection(Item.all)
  end

private

  def serializer
    ItemSerializer.new
  end
end
