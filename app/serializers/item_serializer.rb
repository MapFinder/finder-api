class ItemSerializer
  def serialize_collection(items)
    items.map do |item|
      {
        id: item.id,
        title: item.title,
        description: item.description,
        images: item.images,
        coords: { ltd: item.latitude, lng: item.longitude },
        date: item.created_at
      }
    end
  end
end
