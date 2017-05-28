class LostItemsController < ApplicationController
  def index
    @items = LostItem.all
    render 'lost_items/index.json'
  end
end
